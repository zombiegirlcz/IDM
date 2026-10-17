package v4l;

import com.revolut.data.model.Data;
import efm.v;
import efm.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends ofm.a implements v {
    public final Function3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function2 f286139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function2 f286140h;
    public Object i;

    public c(y yVar, Function3 function3, Function2 function2, Function2 function22) {
        super(yVar);
        this.f = function3;
        this.f286139g = function2;
        this.f286140h = function22;
    }

    @Override // efm.v
    public final y a(y downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        return new c(downstream, this.f, this.f286139g, this.f286140h);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        Data data = (Data) obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.d) {
            return;
        }
        int i = this.e;
        y yVar = this.f224907a;
        if (i != 0) {
            yVar.onNext(null);
            return;
        }
        try {
            Throwable error = data.getError();
            Throwable th10 = error != null ? (Throwable) this.f286140h.invoke(error, data.getContent()) : null;
            if (th10 != null) {
                c(th10);
                return;
            }
            Object content = data.getContent();
            Object objInvoke = content != null ? this.f.invoke(content, Boolean.valueOf(data.getLoading()), error) : this.f286139g.invoke(Boolean.valueOf(data.getLoading()), error);
            if (objInvoke == null || objInvoke.equals(this.i)) {
                return;
            }
            this.i = objInvoke;
            yVar.onNext(objInvoke);
        } catch (Throwable th11) {
            c(th11);
        }
    }

    @Override // nfm.j
    public final Object poll() throws Throwable {
        while (true) {
            Data data = (Data) this.f224909c.poll();
            if (data == null) {
                return null;
            }
            Throwable error = data.getError();
            Throwable th10 = error != null ? (Throwable) this.f286140h.invoke(error, data.getContent()) : null;
            if (th10 != null) {
                throw th10;
            }
            Object content = data.getContent();
            Object objInvoke = content != null ? this.f.invoke(content, Boolean.valueOf(data.getLoading()), error) : this.f286139g.invoke(Boolean.valueOf(data.getLoading()), error);
            if (objInvoke != null && !objInvoke.equals(this.i)) {
                this.i = objInvoke;
                return objInvoke;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Function3 contentMapper, Function2 nullContentHandler, Function2 consumeErrors) {
        this(null, contentMapper, nullContentHandler, consumeErrors);
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
    }
}

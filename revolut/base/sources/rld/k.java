package rld;

import aii.q;
import android.net.Uri;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f255021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f255022x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i, Continuation continuation) {
        super(1, continuation);
        this.f255021w = mVar;
        this.f255022x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f255021w, this.f255022x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        m mVar = this.f255021w;
        if (i == 0) {
            yhm.o.b(obj2);
            String string = ((SlotDefaultPrompt.Action) mVar.o.f87376a.f87320b.f87330g.get(this.f255022x)).f87322b;
            Uri uri2 = ((f80.b) mVar.f255028s).g(string);
            String queryParameter = null;
            if (uri2 != null) {
                try {
                    if (!uri2.isOpaque()) {
                        queryParameter = uri2.getQueryParameter("presentation_type");
                    }
                } catch (Exception unused) {
                }
            }
            boolean zF = Intrinsics.f(queryParameter, "inline");
            if (zF) {
                b bVar = mVar.u;
                String token = ((h) ((j2) mVar.v.f22677a).getValue()).f255019b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(uri2, "uri");
                Intrinsics.checkNotNullParameter(token, "token");
                if (uri2.isOpaque() || uri2.getQueryParameterNames().contains("_sm_pa_token")) {
                    string = uri2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else {
                    string = uri2.buildUpon().appendQueryParameter("_sm_pa_token", token).build().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                }
            }
            x xVar = mVar.f255025p;
            Boolean bool = Boolean.FALSE;
            this.u = zF;
            this.v = 1;
            obj2 = lg0.b.x1(xVar, string, null, bool, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
            z = zF;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.u;
            yhm.o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (!z || !zBooleanValue) {
            mVar.C2(q.f5292a);
        }
        return Unit.f186387a;
    }
}

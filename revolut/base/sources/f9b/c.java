package f9b;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132894a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f132896c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ c(f fVar, Function1 function1, boolean z, boolean z3) {
        this.f132895b = fVar;
        this.f132896c = function1;
        this.d = z;
        this.e = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f132894a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (error != null && (this.d || data.getContent() == null)) {
                    i iVar = this.f132895b.f132903b;
                    Function1 function1 = this.f132896c;
                    iVar.b(error, function1 != null ? function1 : null, null, false, this.e);
                }
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                i iVar2 = this.f132895b.f132903b;
                Intrinsics.h(th10);
                Function1 function12 = this.f132896c;
                iVar2.b(th10, function12 != null ? function12 : null, null, this.d, this.e);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ c(boolean z, f fVar, Function1 function1, boolean z3) {
        this.d = z;
        this.f132895b = fVar;
        this.f132896c = function1;
        this.e = z3;
    }
}

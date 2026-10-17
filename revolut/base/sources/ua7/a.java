package ua7;

import com.revolut.feature.hidden_accounts.api.provider.HideOption$HideFromHome;
import com.revolut.feature.hidden_accounts.api.provider.HideOption$MakeSecret;
import com.revolut.kompot.common.ModalDestination;
import eii.g;
import eii.i;
import eii.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f278549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f278550c;

    public /* synthetic */ a(f fVar, String str, int i) {
        this.f278548a = i;
        this.f278549b = fVar;
        this.f278550c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f278548a) {
            case 0:
                k result = (k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof i) {
                    Object obj3 = ((i) result).f126655a;
                    boolean zF = Intrinsics.f(obj3, HideOption$HideFromHome.f74650a);
                    f fVar = this.f278549b;
                    String str = this.f278550c;
                    Continuation continuation = null;
                    if (zF) {
                        fVar.getClass();
                        fVar.V2(new b(fVar, str, continuation, 1), new yi5.b(29));
                    } else if (Intrinsics.f(obj3, HideOption$MakeSecret.f74651a)) {
                        CharSequence charSequence = (CharSequence) fVar.f278556l.f295849c.a(new tk0.d("SECRET_ACCOUNTS_PHRASE"));
                        if (charSequence == null || charSequence.length() == 0) {
                            n.P2(fVar, fVar.o2(new qa7.c(str)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                        } else {
                            fVar.V2(new e(fVar, str, null), new yi5.b(29));
                        }
                    }
                }
                break;
            case 1:
                k result2 = (k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof g) {
                    f fVar2 = this.f278549b;
                    fVar2.getClass();
                    fVar2.V2(new b(fVar2, this.f278550c, null, 1), new yi5.b(29));
                }
                break;
            default:
                f fVar3 = this.f278549b;
                fVar3.V2(new b(fVar3, this.f278550c, null, 0), new yi5.b(29));
                break;
        }
        return Unit.f186387a;
    }
}

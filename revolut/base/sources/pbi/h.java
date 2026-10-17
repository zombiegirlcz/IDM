package pbi;

import com.revolut.data.model.Data;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tif.n;
import tif.o;
import tif.p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f234692b;

    public /* synthetic */ h(r rVar, int i) {
        this.f234691a = i;
        this.f234692b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234691a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (data.getContent() == null && data.getError() != null) {
                    return this.f234692b;
                }
                r rVarJust = r.just(data);
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 1:
                Data cardData = (Data) obj2;
                Intrinsics.checkNotNullParameter(cardData, "cardData");
                return cardData.getContent() == null ? this.f234692b : w.h(cardData);
            case 2:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 3:
                Boolean it9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 4:
                p state = (p) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                boolean z = state instanceof o;
                r rVar = this.f234692b;
                if (z) {
                    return rVar.timeout(((o) state).f271516a, TimeUnit.MILLISECONDS, hhm.f.f152431c);
                }
                if (state instanceof n) {
                    return rVar;
                }
                throw new NoWhenBranchMatchedException();
            default:
                Boolean isOpen = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOpen, "isOpen");
                return isOpen.booleanValue() ? r.empty() : this.f234692b;
        }
        return this.f234692b;
    }
}

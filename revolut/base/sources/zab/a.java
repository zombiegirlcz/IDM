package zab;

import com.revolut.data.model.Data;
import com.revolut.domain.models.login.ChannelType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f320592b;

    public /* synthetic */ a(d dVar, int i) {
        this.f320591a = i;
        this.f320592b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f320591a) {
            case 0:
                String str = (String) obj2;
                te0.v email = this.f320592b.f320600b.getEmail();
                Intrinsics.h(str);
                ((te0.r) email).set(str);
                break;
            case 1:
                ChannelType it8 = (ChannelType) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ChannelType channelType = ChannelType.SMS;
                break;
            case 2:
                ihm.j jVar = this.f320592b.i;
                Unit unit = Unit.f186387a;
                jVar.onNext(unit);
                break;
            case 3:
                te0.e eVarV = this.f320592b.f320600b.v();
                m70.a.c(t0.f186434a);
                eVarV.set("");
                break;
            case 4:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f320592b.f320603h.onNext(new Data(null, it9, false));
                break;
            case 5:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                this.f320592b.f.onNext(new Data(null, it10, false));
                break;
            default:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                this.f320592b.f320602g.onNext(new Data(null, it11, false));
                break;
        }
        return Unit.f186387a;
    }
}

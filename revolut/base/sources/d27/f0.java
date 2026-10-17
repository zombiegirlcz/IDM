package d27;

import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw6.b f110743b;

    public /* synthetic */ f0(kw6.b bVar, int i) {
        this.f110742a = i;
        this.f110743b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110742a) {
            case 0:
                u update = (u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                r rVar = update.f110775g;
                LocalDate localDate = this.f110743b.f190295a;
                boolean z = rVar.f110768b;
                rVar.getClass();
                return u.a(update, null, null, null, null, null, false, new r(localDate, z), null, null, null, null, 1983);
            case 1:
                fy6.i update2 = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                fy6.h hVar = update2.f138939c;
                return fy6.i.a(update2, null, null, hVar != null ? fy6.h.a(hVar, null, new fy6.k(this.f110743b.f190295a), 1) : null, null, 11);
            default:
                u37.g update3 = (u37.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return u37.g.a(update3, null, null, null, this.f110743b.f190295a, null, false, 55);
        }
    }
}

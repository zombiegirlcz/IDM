package evj;

import java.time.LocalTime;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalTime f129975b;

    public /* synthetic */ g(LocalTime localTime, int i) {
        this.f129974a = i;
        this.f129975b = localTime;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f129974a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                LocalTime selectedTime = this.f129975b;
                Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                return new a(selectedTime);
            default:
                fhi.d update2 = (fhi.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                wgi.a alarmDay = update2.f135240a;
                Intrinsics.checkNotNullParameter(alarmDay, "alarmDay");
                LocalTime alarmTime = this.f129975b;
                Intrinsics.checkNotNullParameter(alarmTime, "alarmTime");
                return new fhi.d(alarmDay, alarmTime);
        }
    }
}

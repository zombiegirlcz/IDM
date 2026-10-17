package ooj;

import efm.d0;
import java.time.LocalDate;
import java.time.Month;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements q7l.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f227134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7l.a f227135b;

    public c(q7l.b defaultAppearanceProvider, toj.b regularWelcomeMessageProvider, e dateProvider) {
        Intrinsics.checkNotNullParameter(defaultAppearanceProvider, "defaultAppearanceProvider");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f227134a = dateProvider;
        this.f227135b = q7l.a.HIGH;
    }

    @Override // q7l.b
    public final q7l.a a() {
        return this.f227135b;
    }

    @Override // q7l.b
    public final String b() {
        return "ID_EVENT_BIRTHDAY";
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        LocalDate today = ((f) this.f227134a).e();
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(today, "today");
        LocalDate localDate = user.f233792c;
        if (localDate == null) {
            return false;
        }
        return (localDate.getMonth() == today.getMonth() && localDate.getDayOfMonth() == today.getDayOfMonth()) || (localDate.getMonth() == Month.FEBRUARY && localDate.getDayOfMonth() == 29 && !today.isLeapYear() && today.getMonth() == Month.MARCH && today.getDayOfMonth() == 1);
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        ufm.c cVar = new ufm.c(new a(this, user), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

package fq0;

import java.time.DayOfWeek;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {

    /* JADX INFO: renamed from: fq0.a$a, reason: collision with other inner class name */
    public static final class C0802a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0802a f137163a = new C0802a();

        private C0802a() {
        }

        @Override // fq0.a
        public final boolean a(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return true;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f137164a = new b();

        private b() {
        }

        @Override // fq0.a
        public final boolean a(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
            DayOfWeek dayOfWeek2 = DayOfWeek.FRIDAY;
            DayOfWeek dayOfWeek3 = date.getDayOfWeek();
            Intrinsics.checkNotNullExpressionValue(dayOfWeek3, "getDayOfWeek(...)");
            return dayOfWeek3.compareTo(dayOfWeek) >= 0 && dayOfWeek3.compareTo(dayOfWeek2) <= 0;
        }
    }

    private a() {
    }

    public abstract boolean a(LocalDate localDate);
}

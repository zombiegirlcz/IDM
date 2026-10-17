package fq0;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137169a = new a();

        private a() {
        }

        @Override // fq0.f
        public final boolean a(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return true;
        }
    }

    private f() {
    }

    public abstract boolean a(LocalDate localDate);
}

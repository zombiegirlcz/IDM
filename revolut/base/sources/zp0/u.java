package zp0;

import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class u {

    public static final class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f324146a = new a();

        private a() {
        }

        @Override // zp0.u
        public final Pair a(v vVar, Date date, q dobDateValidator) {
            Intrinsics.checkNotNullParameter(dobDateValidator, "dobDateValidator");
            return new Pair(date, vVar != null ? vVar.f324148a : null);
        }
    }

    public static final class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f324147a = new b();

        private b() {
        }

        @Override // zp0.u
        public final Pair a(v vVar, Date date, q dobDateValidator) {
            Intrinsics.checkNotNullParameter(dobDateValidator, "dobDateValidator");
            return new Pair(date, date == null ? vVar != null ? vVar.f324148a : null : null);
        }
    }

    private u() {
    }

    public abstract Pair a(v vVar, Date date, q qVar);
}

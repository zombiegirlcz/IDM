package pjd;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public static final class a {

        @NotNull
        public static final C1310a Companion = new C1310a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f236732h = new a(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f236733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f236734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f236735c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f236736g;

        /* JADX INFO: renamed from: pjd.b$a$a, reason: collision with other inner class name */
        public static final class C1310a {
            private C1310a() {
            }
        }

        public a() {
            this(0);
        }

        public static a a(a aVar, String str, String str2, boolean z, boolean z3, boolean z4, boolean z6, c cVar, int i) {
            if ((i & 1) != 0) {
                str = aVar.f236733a;
            }
            String str3 = str;
            if ((i & 2) != 0) {
                str2 = aVar.f236734b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                z = aVar.f236735c;
            }
            boolean z11 = z;
            if ((i & 8) != 0) {
                z3 = aVar.d;
            }
            boolean z12 = z3;
            if ((i & 16) != 0) {
                z4 = aVar.e;
            }
            boolean z29 = z4;
            if ((i & 32) != 0) {
                z6 = aVar.f;
            }
            boolean z31 = z6;
            if ((i & 64) != 0) {
                cVar = aVar.f236736g;
            }
            aVar.getClass();
            return new a(str3, str4, z11, z12, z29, z31, cVar);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f236733a, aVar.f236733a) && Intrinsics.f(this.f236734b, aVar.f236734b) && this.f236735c == aVar.f236735c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Intrinsics.f(this.f236736g, aVar.f236736g);
        }

        public final int hashCode() {
            String str = this.f236733a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f236734b;
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f236735c), 31, this.d), 31, this.e), 31, this.f);
            c cVar = this.f236736g;
            return iC + (cVar != null ? cVar.hashCode() : 0);
        }

        public /* synthetic */ a(int i) {
            this(null, null, false, false, false, false, null);
        }

        public a(String str, String str2, boolean z, boolean z3, boolean z4, boolean z6, c cVar) {
            this.f236733a = str;
            this.f236734b = str2;
            this.f236735c = z;
            this.d = z3;
            this.e = z4;
            this.f = z6;
            this.f236736g = cVar;
        }
    }

    public static CompositeClause a(Clause clause, TextLocalisedClause textLocalisedClause) {
        if (clause == null && textLocalisedClause == null) {
            return null;
        }
        Clause[] elements = {clause, textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}

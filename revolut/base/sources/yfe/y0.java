package yfe;

import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y0 {

    public static final class a extends y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f313324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f313325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f313326c;
        public final StylableContactImage$Style d;

        public a() {
            this(null, null, null, null, 15);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f313324a, aVar.f313324a) && Intrinsics.f(this.f313325b, aVar.f313325b) && Intrinsics.f(this.f313326c, aVar.f313326c) && Intrinsics.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.f313324a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f313325b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f313326c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            StylableContactImage$Style stylableContactImage$Style = this.d;
            return iHashCode3 + (stylableContactImage$Style != null ? stylableContactImage$Style.hashCode() : 0);
        }

        public a(String str, String str2, String str3, StylableContactImage$Style stylableContactImage$Style, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 4) != 0 ? null : str3;
            stylableContactImage$Style = (i & 8) != 0 ? null : stylableContactImage$Style;
            this.f313324a = str;
            this.f313325b = str2;
            this.f313326c = str3;
            this.d = stylableContactImage$Style;
        }
    }

    private y0() {
    }
}

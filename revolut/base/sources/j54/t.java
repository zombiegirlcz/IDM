package j54;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class t extends aii.m {
    private t() {
    }

    public static final class c extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f171565b;

        public c(NaviCommand naviCommand) {
            this.f171565b = naviCommand;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f171565b, ((c) obj2).f171565b);
        }

        public final int hashCode() {
            NaviCommand naviCommand = this.f171565b;
            if (naviCommand == null) {
                return 0;
            }
            return naviCommand.hashCode();
        }

        public c() {
            this(null);
        }
    }

    public static final class a extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f171561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f171562c;

        public a(NaviCommand naviCommand, String str) {
            this.f171561b = naviCommand;
            this.f171562c = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f171561b, aVar.f171561b) && Intrinsics.f(this.f171562c, aVar.f171562c);
        }

        public final int hashCode() {
            NaviCommand naviCommand = this.f171561b;
            int iHashCode = (naviCommand == null ? 0 : naviCommand.hashCode()) * 31;
            String str = this.f171562c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public a() {
            this(null, null);
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f171563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f171564c;

        public b(NaviCommand naviCommand, String str) {
            this.f171563b = naviCommand;
            this.f171564c = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f171563b, bVar.f171563b) && Intrinsics.f(this.f171564c, bVar.f171564c);
        }

        public final int hashCode() {
            NaviCommand naviCommand = this.f171563b;
            int iHashCode = (naviCommand == null ? 0 : naviCommand.hashCode()) * 31;
            String str = this.f171564c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public b() {
            this(null, null);
        }
    }
}

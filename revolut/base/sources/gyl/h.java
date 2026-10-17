package gyl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147925c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147927h;

    public /* synthetic */ h(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            j1.f(f.f147922a.getDescriptor(), i, 255);
            throw null;
        }
        this.f147923a = str;
        this.f147924b = str2;
        this.f147925c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f147926g = str7;
        this.f147927h = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f147923a, hVar.f147923a) && Intrinsics.f(this.f147924b, hVar.f147924b) && Intrinsics.f(this.f147925c, hVar.f147925c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f147926g, hVar.f147926g) && Intrinsics.f(this.f147927h, hVar.f147927h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f147923a.hashCode() * 31, 31, this.f147924b), 31, this.f147925c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147926g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f147927h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public h(String id10, String title, String titleTrailingIcon, String titleTrailingIconColor, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleTrailingIcon, "titleTrailingIcon");
        Intrinsics.checkNotNullParameter(titleTrailingIconColor, "titleTrailingIconColor");
        this.f147923a = id10;
        this.f147924b = title;
        this.f147925c = titleTrailingIcon;
        this.d = titleTrailingIconColor;
        this.e = str;
        this.f = str2;
        this.f147926g = str3;
        this.f147927h = str4;
    }
}

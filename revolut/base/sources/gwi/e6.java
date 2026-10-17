package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class e6 {

    @NotNull
    public static final d6 Companion = new d6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147384c;
    public final String d;

    public /* synthetic */ e6(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(c6.f147367a.getDescriptor(), i, 15);
            throw null;
        }
        this.f147382a = str;
        this.f147383b = str2;
        this.f147384c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj2;
        return Intrinsics.f(this.f147382a, e6Var.f147382a) && Intrinsics.f(this.f147383b, e6Var.f147383b) && Intrinsics.f(this.f147384c, e6Var.f147384c) && Intrinsics.f(this.d, e6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f147382a.hashCode() * 31, 31, this.f147383b), 31, this.f147384c);
    }

    public e6(String imageUrl, String title, String description, String primaryButtonText) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f147382a = imageUrl;
        this.f147383b = title;
        this.f147384c = description;
        this.d = primaryButtonText;
    }
}

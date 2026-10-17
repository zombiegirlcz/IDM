package gw0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.v7;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f147233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f147234c;
    public final TextClause d;
    public final Object e;

    public b(String listId, ResourceImage image, TextClause textClause, TextClause textClause2, File file) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f147232a = listId;
        this.f147233b = image;
        this.f147234c = textClause;
        this.d = textClause2;
        this.e = file;
    }

    @Override // gw0.h
    public final Object a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f147232a, bVar.f147232a) && this.f147233b.equals(bVar.f147233b) && this.f147234c.equals(bVar.f147234c) && this.d.equals(bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(v7.b(org.bouncycastle.jcajce.provider.digest.a.b(this.f147233b, this.f147232a.hashCode() * 31, 31), 31, this.f147234c), 31, this.d);
        Object obj2 = this.e;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }
}

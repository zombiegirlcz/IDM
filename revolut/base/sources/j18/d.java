package j18;

import com.youTransactor.uCube.rpc.Constants;
import java.time.Instant;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] i = {null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(28)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f170139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170140c;
    public final String d;
    public final String e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f170142h;

    public /* synthetic */ d(int i2, String str, f fVar, String str2, String str3, String str4, Instant instant, String str5, String str6) {
        if (249 != (i2 & Constants.TAG_RESOURCE_FILE_VERSION)) {
            j1.f(b.f170137a.getDescriptor(), i2, Constants.TAG_RESOURCE_FILE_VERSION);
            throw null;
        }
        this.f170138a = str;
        if ((i2 & 2) == 0) {
            this.f170139b = f.UNKNOWN;
        } else {
            this.f170139b = fVar;
        }
        if ((i2 & 4) == 0) {
            this.f170140c = "airtip_trading";
        } else {
            this.f170140c = str2;
        }
        this.d = str3;
        this.e = str4;
        this.f = instant;
        this.f170141g = str5;
        this.f170142h = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f170138a, dVar.f170138a) && this.f170139b == dVar.f170139b && Intrinsics.f(this.f170140c, dVar.f170140c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f170141g, dVar.f170141g) && Intrinsics.f(this.f170142h, dVar.f170142h);
    }

    public final int hashCode() {
        return this.f170142h.hashCode() + p.a.c(r6.b.c(p.a.c(p.a.c(p.a.c((this.f170139b.hashCode() + (this.f170138a.hashCode() * 31)) * 31, 31, this.f170140c), 31, this.d), 31, this.e), 31, this.f), 31, this.f170141g);
    }

    public d(String id10, f type, String typeId, String title, String subtitle, Instant expirationDate, String ref2, String assistantQuery) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assistantQuery, "assistantQuery");
        this.f170138a = id10;
        this.f170139b = type;
        this.f170140c = typeId;
        this.d = title;
        this.e = subtitle;
        this.f = expirationDate;
        this.f170141g = ref2;
        this.f170142h = assistantQuery;
    }
}

package qg6;

import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245657c;
    public final ArrayList d;
    public final ThirdPartyBrazil e;

    public b(String title, String description, String disclaimer, ArrayList groups, ThirdPartyBrazil thirdParty) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        this.f245655a = title;
        this.f245656b = description;
        this.f245657c = disclaimer;
        this.d = groups;
        this.e = thirdParty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f245655a, bVar.f245655a) && Intrinsics.f(this.f245656b, bVar.f245656b) && Intrinsics.f(this.f245657c, bVar.f245657c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f245655a.hashCode() * 31, 31, this.f245656b), 31, this.f245657c), 31);
    }
}

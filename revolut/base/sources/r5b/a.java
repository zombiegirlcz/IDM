package r5b;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f251557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f251558c;
    public final ParameterisedHyperText d;

    public a(String title, ArrayList items, ArrayList actions, ParameterisedHyperText termsAndConditions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f251556a = title;
        this.f251557b = items;
        this.f251558c = actions;
        this.d = termsAndConditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251556a, aVar.f251556a) && this.f251557b.equals(aVar.f251557b) && this.f251558c.equals(aVar.f251558c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.f74758a.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f251558c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f251557b, this.f251556a.hashCode() * 31, 31), 31);
    }
}

package agi;

import com.revolut.feature_travel_hotels_models.property.Description;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Description f4841c;

    public b(String title, a icon, Description description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f4839a = title;
        this.f4840b = icon;
        this.f4841c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f4839a, bVar.f4839a) && this.f4840b == bVar.f4840b && Intrinsics.f(this.f4841c, bVar.f4841c);
    }

    public final int hashCode() {
        return this.f4841c.hashCode() + ((this.f4840b.hashCode() + (this.f4839a.hashCode() * 31)) * 31);
    }
}

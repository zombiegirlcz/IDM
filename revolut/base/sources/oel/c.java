package oel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f224625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f224626c;

    public c(ArrayList tags, ArrayList keyPersons, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(keyPersons, "keyPersons");
        this.f224624a = description;
        this.f224625b = tags;
        this.f224626c = keyPersons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f224624a, cVar.f224624a) && this.f224625b.equals(cVar.f224625b) && this.f224626c.equals(cVar.f224626c);
    }

    public final int hashCode() {
        return this.f224626c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f224625b, this.f224624a.hashCode() * 31, 31);
    }
}

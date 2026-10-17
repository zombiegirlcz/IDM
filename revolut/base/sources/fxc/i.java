package fxc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t61.g f138794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f138795c;
    public final List d;

    public i(Data data, t61.g selectedExternalCard, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedExternalCard, "selectedExternalCard");
        this.f138793a = data;
        this.f138794b = selectedExternalCard;
        this.f138795c = z;
        h hVar = (h) data.getContent();
        this.d = hVar != null ? hVar.f138791a : null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f138793a, iVar.f138793a) && Intrinsics.f(this.f138794b, iVar.f138794b) && this.f138795c == iVar.f138795c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138795c) + ((this.f138794b.hashCode() + (this.f138793a.hashCode() * 31)) * 31);
    }
}

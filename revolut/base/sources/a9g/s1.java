package a9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"La9g/s1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "name", "c", "f", "type", "", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "totalProperties", "imageUrl", "", "Ljava/util/List;", "()Ljava/util/List;", "categories", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalProperties")
    private final Integer totalProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    private final String imageUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<String> categories;

    public s1(String id10, String name, String str, Integer num, String str2, ArrayList categories) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.id = id10;
        this.name = name;
        this.type = str;
        this.totalProperties = num;
        this.imageUrl = str2;
        this.categories = categories;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTotalProperties() {
        return this.totalProperties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.id, s1Var.id) && Intrinsics.f(this.name, s1Var.name) && Intrinsics.f(this.type, s1Var.type) && Intrinsics.f(this.totalProperties, s1Var.totalProperties) && Intrinsics.f(this.imageUrl, s1Var.imageUrl) && Intrinsics.f(this.categories, s1Var.categories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.type;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalProperties;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.imageUrl;
        return this.categories.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

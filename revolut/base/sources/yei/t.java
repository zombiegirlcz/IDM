package yei;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0016"}, d2 = {"Lyei/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "", "b", "Z", "e", "()Z", "isPrivate", "d", "registrationNumber", "", "Ljava/util/List;", "()Ljava/util/List;", "languages", "image", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isPrivate")
    private final boolean isPrivate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("registrationNumber")
    private final String registrationNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("languages")
    @NotNull
    private final List<String> languages;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    private final String image;

    public t(String str, String str2, String str3, List languages, boolean z) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.name = str;
        this.isPrivate = z;
        this.registrationNumber = str2;
        this.languages = languages;
        this.image = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getLanguages() {
        return this.languages;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.name, tVar.name) && this.isPrivate == tVar.isPrivate && Intrinsics.f(this.registrationNumber, tVar.registrationNumber) && Intrinsics.f(this.languages, tVar.languages) && Intrinsics.f(this.image, tVar.image);
    }

    public final int hashCode() {
        String str = this.name;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.isPrivate);
        String str2 = this.registrationNumber;
        int iD = p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.languages);
        String str3 = this.image;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }
}

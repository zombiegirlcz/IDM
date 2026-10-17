package r5b;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251566c;
    public final ArrayList d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ParameterisedHyperText f251567g;

    public e(String title, String str, String str2, ArrayList inputFields, String actionButtonTitle, String str3, ParameterisedHyperText parameterisedHyperText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputFields, "inputFields");
        Intrinsics.checkNotNullParameter(actionButtonTitle, "actionButtonTitle");
        this.f251564a = title;
        this.f251565b = str;
        this.f251566c = str2;
        this.d = inputFields;
        this.e = actionButtonTitle;
        this.f = str3;
        this.f251567g = parameterisedHyperText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f251564a, eVar.f251564a) && Intrinsics.f(this.f251565b, eVar.f251565b) && Intrinsics.f(this.f251566c, eVar.f251566c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f251567g, eVar.f251567g);
    }

    public final int hashCode() {
        int iHashCode = this.f251564a.hashCode() * 31;
        String str = this.f251565b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f251566c;
        int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        String str3 = this.f;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        ParameterisedHyperText parameterisedHyperText = this.f251567g;
        return iHashCode3 + (parameterisedHyperText != null ? parameterisedHyperText.f74758a.hashCode() : 0);
    }
}

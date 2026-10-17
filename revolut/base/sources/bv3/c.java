package bv3;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import cv3.p;
import cv3.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18948c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f18949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f18950h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f18951j;
    public final Button k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f18952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f18953m;

    public c(p pVar, String str, String str2, String str3, String str4, String str5, e subtitleImage, ArrayList arrayList, List actionItems, ArrayList items, Button primaryButton, f fVar, String str6) {
        Intrinsics.checkNotNullParameter(subtitleImage, "subtitleImage");
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f18946a = pVar;
        this.f18947b = str;
        this.f18948c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f18949g = subtitleImage;
        this.f18950h = arrayList;
        this.i = actionItems;
        this.f18951j = items;
        this.k = primaryButton;
        this.f18952l = fVar;
        this.f18953m = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18946a, cVar.f18946a) && Intrinsics.f(this.f18947b, cVar.f18947b) && Intrinsics.f(this.f18948c, cVar.f18948c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f18949g == cVar.f18949g && Intrinsics.f(this.f18950h, cVar.f18950h) && Intrinsics.f(this.i, cVar.i) && this.f18951j.equals(cVar.f18951j) && this.k.equals(cVar.k) && Intrinsics.f(this.f18952l, cVar.f18952l) && Intrinsics.f(this.f18953m, cVar.f18953m);
    }

    public final int hashCode() {
        r rVar = this.f18946a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        String str = this.f18947b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18948c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (this.f18949g.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        List list = this.f18950h;
        int iHashCode7 = (this.k.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f18951j, p.a.d((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31, 31, this.i), 31)) * 31;
        f fVar = this.f18952l;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str6 = this.f18953m;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }
}

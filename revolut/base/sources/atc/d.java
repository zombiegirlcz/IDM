package atc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f9028c;

    public d(f01.a resources, int[] keywords) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.f9026a = resources;
        this.f9027b = keywords;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        String[] strArr = this.f9028c;
        if (strArr == null) {
            int[] iArr = this.f9027b;
            int length = iArr.length;
            if (length == 0) {
                strArr = new String[0];
            } else {
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = this.f9026a.b(new TextLocalisedClause(iArr[i], null, null, 14)).toString();
                }
                strArr = strArr2;
            }
            this.f9028c = strArr;
        }
        for (String str : strArr) {
            targetCollection.add(str);
        }
    }
}

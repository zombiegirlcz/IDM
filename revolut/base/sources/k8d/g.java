package k8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f182108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f182109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f182110c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f182111g;

    public g(Data title, Data node, Data nodeContent, Data items, Data showHelpButton, Data transactions, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(nodeContent, "nodeContent");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(showHelpButton, "showHelpButton");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f182108a = title;
        this.f182109b = node;
        this.f182110c = nodeContent;
        this.d = items;
        this.e = showHelpButton;
        this.f = transactions;
        this.f182111g = z;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = gVar.f182108a;
        }
        Data title = data;
        if ((i & 2) != 0) {
            data2 = gVar.f182109b;
        }
        Data node = data2;
        if ((i & 4) != 0) {
            data3 = gVar.f182110c;
        }
        Data nodeContent = data3;
        if ((i & 8) != 0) {
            data4 = gVar.d;
        }
        Data items = data4;
        if ((i & 16) != 0) {
            data5 = gVar.e;
        }
        Data showHelpButton = data5;
        gVar.getClass();
        if ((i & 64) != 0) {
            data6 = gVar.f;
        }
        Data transactions = data6;
        gVar.getClass();
        boolean z = gVar.f182111g;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(nodeContent, "nodeContent");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(showHelpButton, "showHelpButton");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new g(title, node, nodeContent, items, showHelpButton, transactions, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f182108a, gVar.f182108a) && Intrinsics.f(this.f182109b, gVar.f182109b) && Intrinsics.f(this.f182110c, gVar.f182110c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f182111g == gVar.f182111g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182111g) + kii.e.c(this.f, j6.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f182110c, kii.e.c(this.f182109b, this.f182108a.hashCode() * 31, 31), 31), 31), 31), 31, false), 961);
    }

    public /* synthetic */ g(Data data, Data data2, Data data3, Data data4, Data data5, boolean z) {
        this(data, data2, data3, data4, data5, new Data(null, null, true, 3, null), z);
    }
}

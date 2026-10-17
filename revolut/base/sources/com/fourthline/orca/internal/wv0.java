package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wv0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sv0 f34806a;

    public wv0(String title, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.shared_button_close, 0, 2, null);
        this.f34806a = new sv0(title, zhm.f0.f322471a, dVarA, imageServiceLocator.a(r10.X0), imageServiceLocator.a(r10.W0));
    }

    public final Function1 a(String title, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new jn1(title, pages, 23);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public sv0 getInitialState() {
        return this.f34806a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sv0 a(String str, List list, sv0 sv0Var) {
        Intrinsics.checkNotNullParameter(sv0Var, "<this>");
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) it8.next()));
        }
        return sv0.a(sv0Var, str, arrayList, null, null, null, 28, null);
    }
}

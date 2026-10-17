package rp0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements g1 {

    @NotNull
    public static final h1 Companion = new h1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f256108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f256109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yr0.r f256110c;
    public final ihm.f d;

    public k1(View view, View view2) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f256108a = view;
        this.f256109b = view2;
        this.d = v0.a.d("create(...)");
    }

    public static void a(ViewGroup viewGroup, ViewGroup viewGroup2, Collection collection, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt.getVisibility() == 0) {
                if (collection.contains(kotlin.jvm.internal.o0.f186429a.b(childAt.getClass())) && b(childAt, viewGroup2)) {
                    arrayList.add(childAt);
                } else if ((childAt instanceof ViewGroup) && b(childAt, viewGroup2)) {
                    a((ViewGroup) childAt, viewGroup2, collection, arrayList);
                }
            }
        }
    }

    public static boolean b(View view, ViewGroup viewGroup) {
        int height = viewGroup.getHeight();
        float fH = knm.b.h(view, viewGroup);
        float f = height;
        if (fH > f) {
            return false;
        }
        float height2 = f - (fH + view.getHeight());
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return height2 < ((float) kli.a.k(context, 100.0f));
    }

    public final void c() {
        yr0.r rVar = this.f256110c;
        if (rVar != null) {
            rVar.dismiss();
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "javaClass", "Shot is not shown and can not be hidden.", null, null, 16);
        }
    }

    public final void d(ShotDialogDisplayer$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        jo0.c.a(configuration, new rgf.m(this, configuration, 19));
    }
}

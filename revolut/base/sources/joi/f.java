package joi;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f177095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f177096c;
    public final float d;
    public float e = BitmapDescriptorFactory.HUE_RED;

    public f(String str, View view, ArrayList arrayList, float f) {
        this.f177094a = str;
        this.f177095b = view;
        this.f177096c = arrayList;
        this.d = f;
    }

    public final boolean a(View view) {
        Object obj2;
        ArrayList arrayList = this.f177096c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            if (((n) obj2).f177110a == view) {
                break;
            }
            i++;
        }
        n nVar = (n) obj2;
        if (nVar != null) {
            nVar.b(true);
            return false;
        }
        n nVar2 = new n(view);
        nVar2.b(true);
        arrayList.add(nVar2);
        return true;
    }

    public final void b() {
        ArrayList arrayList = this.f177096c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) arrayList.get(i)).a();
        }
        this.e = BitmapDescriptorFactory.HUE_RED;
    }

    public final void c(float f) {
        this.e = f;
        View view = this.f177095b;
        float pivotX = view.getPivotX() + view.getTranslationX() + view.getLeft();
        float pivotY = view.getPivotY() + view.getTranslationY() + view.getTop();
        ArrayList arrayList = this.f177096c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList.get(i);
            nVar.getClass();
            float fB = i1.b(1.0f, 1.015f, f);
            View view2 = nVar.f177110a;
            view2.setPivotX(pivotX - view2.getX());
            view2.setPivotY(pivotY - view2.getY());
            view2.setScaleX(fB);
            view2.setScaleY(fB);
        }
    }
}

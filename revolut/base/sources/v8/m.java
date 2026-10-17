package v8;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static Integer d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f286697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f286698b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f286699c;

    public m(ImageView imageView) {
        this.f286697a = imageView;
    }

    public final int a(int i, int i2, int i3) {
        int i5 = i2 - i3;
        if (i5 > 0) {
            return i5;
        }
        int i6 = i - i3;
        if (i6 > 0) {
            return i6;
        }
        View view = this.f286697a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
        }
        Context context = view.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            y8.f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }
}

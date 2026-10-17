package pp0;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public interface a {
    void U(Canvas canvas);

    boolean Z(Canvas canvas, View view, long j2);

    b getDrawingDelegate();

    View getSelf();

    int getViewHeight();

    int getViewWidth();

    void setDrawingDelegate(b bVar);
}

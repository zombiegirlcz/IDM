package ph;

import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.LifecycleObserver;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Closeable, LifecycleObserver {
    int getDetectorType();

    Task process(Image image, int i, Matrix matrix);
}

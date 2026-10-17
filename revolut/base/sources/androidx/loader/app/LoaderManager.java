package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    /* JADX INFO: loaded from: classes15.dex */
    public interface LoaderCallbacks<D> {
        @NonNull
        Loader<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(@NonNull Loader<D> loader, D d);

        void onLoaderReset(@NonNull Loader<D> loader);
    }

    @NonNull
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager getInstance(@NonNull T t2) {
        return new LoaderManagerImpl(t2, t2.getViewModelStore());
    }

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract <D> Loader<D> initLoader(int i, Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);

    public abstract void markForRedelivery();
}

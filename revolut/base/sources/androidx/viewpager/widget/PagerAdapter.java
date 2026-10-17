package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class PagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable = new DataSetObservable();
    private DataSetObserver mViewPagerObserver;

    @Deprecated
    public void destroyItem(@NonNull View view, int i, @NonNull Object obj2) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj2);

    @Deprecated
    public void finishUpdate(@NonNull View view) {
    }

    public abstract void finishUpdate(@NonNull ViewGroup viewGroup);

    public abstract int getCount();

    public int getItemPosition(@NonNull Object obj2) {
        return -1;
    }

    public CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    @NonNull
    @Deprecated
    public Object instantiateItem(@NonNull View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @NonNull
    public abstract Object instantiateItem(@NonNull ViewGroup viewGroup, int i);

    public abstract boolean isViewFromObject(@NonNull View view, @NonNull Object obj2);

    public void notifyDataSetChanged() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.mViewPagerObserver;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public abstract void restoreState(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable saveState();

    @Deprecated
    public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj2) {
    }

    public abstract void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj2);

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    @Deprecated
    public void startUpdate(@NonNull View view) {
    }

    public abstract void startUpdate(@NonNull ViewGroup viewGroup);

    public void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }
}

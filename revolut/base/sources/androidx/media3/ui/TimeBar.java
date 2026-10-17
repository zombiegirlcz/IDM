package androidx.media3.ui;

/* JADX INFO: loaded from: classes15.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j2);

        void onScrubStart(TimeBar timeBar, long j2);

        void onScrubStop(TimeBar timeBar, long j2, boolean z);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i);

    void setBufferedPosition(long j2);

    void setDuration(long j2);

    void setEnabled(boolean z);

    void setPosition(long j2);
}

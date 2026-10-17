package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes16.dex */
class CharSequenceState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final char f24083c;
    int occurrences = 1;

    public CharSequenceState(char c2) {
        this.f24083c = c2;
    }

    public void incrementOccurrences() {
        this.occurrences++;
    }
}

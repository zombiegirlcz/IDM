package androidx.media3.common;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata {
    private final Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(MediaMetadata.Builder builder) {
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    private <T extends Entry> T entryIfMatches(Entry entry, Class<T> cls, Predicate<T> predicate) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T tCast = cls.cast(entry);
        if (predicate.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public Metadata copyWithPresentationTimeUs(long j2) {
        return this.presentationTimeUs == j2 ? this : new Metadata(j2, this.entries);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && Metadata.class == obj2.getClass()) {
            Metadata metadata = (Metadata) obj2;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public Entry get(int i) {
        return this.entries[i];
    }

    public <T extends Entry> ImmutableList<T> getEntriesOfType(Class<T> cls) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getClass())) {
                builder.add(cls.cast(entry));
            }
        }
        return builder.build();
    }

    public <T extends Entry> T getFirstEntryOfType(Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, Predicates.alwaysTrue());
    }

    public <T extends Entry> T getFirstMatchingEntry(Class<T> cls, Predicate<T> predicate) {
        for (Entry entry : this.entries) {
            T t2 = (T) entryIfMatches(entry, cls, predicate);
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    public <T extends Entry> ImmutableList<T> getMatchingEntries(Class<T> cls, Predicate<T> predicate) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Entry entry : this.entries) {
            Entry entryEntryIfMatches = entryIfMatches(entry, cls, predicate);
            if (entryEntryIfMatches != null) {
                builder.add(entryEntryIfMatches);
            }
        }
        return builder.build();
    }

    public int hashCode() {
        return Longs.hashCode(this.presentationTimeUs) + (Arrays.hashCode(this.entries) * 31);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("entries=");
        sb6.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb6.append(str);
        return sb6.toString();
    }

    public Metadata(long j2, Entry... entryArr) {
        this.presentationTimeUs = j2;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j2, List<? extends Entry> list) {
        this(j2, (Entry[]) list.toArray(new Entry[0]));
    }
}

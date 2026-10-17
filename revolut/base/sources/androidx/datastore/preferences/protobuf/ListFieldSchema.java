package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface ListFieldSchema {
    void makeImmutableListAt(Object obj2, long j2);

    <L> void mergeListsAt(Object obj2, Object obj3, long j2);

    <L> List<L> mutableListAt(Object obj2, long j2);
}

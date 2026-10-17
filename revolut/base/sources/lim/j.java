package lim;

import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Llim/j;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "lim/i", "lim/c", "lim/h", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f195570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f195571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f195572c;
    public final Function1 d;
    public final Function2 e;
    public final int f;

    public j(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i = (i2 & 32) != 0 ? Integer.MAX_VALUE : i;
        this.f195570a = file;
        this.f195571b = fileWalkDirection;
        this.f195572c = function1;
        this.d = function12;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new h(this);
    }
}

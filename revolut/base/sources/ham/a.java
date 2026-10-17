package ham;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicReferenceArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f150531a;

    public a(int i) {
        super(i);
        this.f150531a = new AtomicInteger();
    }
}

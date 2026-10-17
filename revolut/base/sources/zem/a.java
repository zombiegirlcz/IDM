package zem;

import icm.m;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f321805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, int i) {
        super(i, 0.75f, true);
        this.f321805a = mVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f321805a.f160342a;
    }
}

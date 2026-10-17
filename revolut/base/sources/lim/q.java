package lim;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f195577b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f195576a = i;
        this.f195577b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gim.h, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f195576a) {
            case 0:
                return new p(this);
            case 1:
                return nkm.p.a((gim.h) this.f195577b);
            case 2:
                return u0.h((Object[]) this.f195577b);
            default:
                return ((Iterable) this.f195577b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2) {
        this.f195576a = 1;
        this.f195577b = (gim.h) function2;
    }

    public q(BufferedReader reader) {
        this.f195576a = 0;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f195577b = reader;
    }
}

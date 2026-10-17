package ael;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3669a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ del.f f3670b;

    public v(del.f fVar) {
        this.f3670b = fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Comparable comparableValueOf;
        Comparable comparableValueOf2;
        int i;
        Comparable comparableValueOf3;
        Comparable comparableValueOf4;
        switch (this.f3669a) {
            case 0:
                del.a aVar = (del.a) obj2;
                del.f fVar = this.f3670b;
                del.d dVar = fVar.f113714a;
                int[] iArr = u.f3662a;
                int i2 = iArr[dVar.ordinal()];
                int i3 = 0;
                if (i2 == 1) {
                    dj0.d dVarB = aVar.b();
                    comparableValueOf = Long.valueOf(dVarB != null ? dVarB.f115082a : 0L);
                } else if (i2 == 2) {
                    comparableValueOf = aVar.d;
                } else if (i2 == 3) {
                    comparableValueOf = aVar.f113704a;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (u.f3664c[aVar.e.f183178j.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i = 0;
                            break;
                        case 6:
                        case 7:
                        case 8:
                            i = 1;
                            break;
                        case 9:
                            i = 2;
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i = 10;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    comparableValueOf = Integer.valueOf(i);
                }
                del.a aVar2 = (del.a) obj3;
                int i5 = iArr[fVar.f113714a.ordinal()];
                if (i5 == 1) {
                    dj0.d dVarB2 = aVar2.b();
                    comparableValueOf2 = Long.valueOf(dVarB2 != null ? dVarB2.f115082a : 0L);
                } else if (i5 == 2) {
                    comparableValueOf2 = aVar2.d;
                } else if (i5 == 3) {
                    comparableValueOf2 = aVar2.f113704a;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (u.f3664c[aVar2.e.f183178j.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            comparableValueOf2 = Integer.valueOf(i3);
                            break;
                        case 6:
                        case 7:
                        case 8:
                            i3 = 1;
                            comparableValueOf2 = Integer.valueOf(i3);
                            break;
                        case 9:
                            i3 = 2;
                            comparableValueOf2 = Integer.valueOf(i3);
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i3 = 10;
                            comparableValueOf2 = Integer.valueOf(i3);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return cim.b.b(comparableValueOf, comparableValueOf2);
            default:
                y49.h hVar = (y49.h) obj2;
                del.f fVar2 = this.f3670b;
                del.d dVar2 = fVar2.f113714a;
                int[] iArr2 = p2b.e.f232197a;
                int i6 = iArr2[dVar2.ordinal()];
                if (i6 == 1) {
                    comparableValueOf3 = Long.valueOf(hVar.e.f115082a);
                } else if (i6 == 2) {
                    comparableValueOf3 = hVar.d;
                } else {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Sort CFD positions by products is not supported");
                    }
                    comparableValueOf3 = hVar.f310847a.d;
                }
                y49.h hVar2 = (y49.h) obj3;
                int i21 = iArr2[fVar2.f113714a.ordinal()];
                if (i21 == 1) {
                    comparableValueOf4 = Long.valueOf(hVar2.e.f115082a);
                } else if (i21 == 2) {
                    comparableValueOf4 = hVar2.d;
                } else {
                    if (i21 != 3) {
                        if (i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Sort CFD positions by products is not supported");
                    }
                    comparableValueOf4 = hVar2.f310847a.d;
                }
                return cim.b.b(comparableValueOf3, comparableValueOf4);
        }
    }

    public v(del.f fVar, w wVar) {
        this.f3670b = fVar;
    }
}

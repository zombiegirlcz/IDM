package com.revolut.flexbox;

import a0.d;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ihi.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihi.a f98249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f98250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f98251c;
    public long[] d;
    public long[] e;

    public b(ihi.a aVar) {
        this.f98249a = aVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.f98240g = i3;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((a) list.get(i5));
            if (i5 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it8 = arrayList.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            c cVar = (c) it8.next();
            int i3 = cVar.f161421a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.f161422b);
            i2++;
        }
        return iArr;
    }

    public final void a(List list, a aVar, int i, int i2) {
        aVar.f98244m = i2;
        this.f98249a.f(aVar);
        aVar.f98246p = i;
        list.add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ihi.b r28, int r29, int r30, int r31, int r32, int r33, java.util.List r34) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.b.b(ihi.b, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r7, android.view.View r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            com.revolut.flexbox.FlexItem r0 = (com.revolut.flexbox.FlexItem) r0
            int r1 = r8.getMeasuredWidth()
            int r2 = r8.getMeasuredHeight()
            int r3 = r0.I1()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.I1()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.Q7()
            if (r1 <= r3) goto L26
            int r1 = r0.Q7()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.A9()
            if (r2 >= r5) goto L32
            int r2 = r0.A9()
            goto L3e
        L32:
            int r5 = r0.L9()
            if (r2 <= r5) goto L3d
            int r2 = r0.L9()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            r6.v(r7, r1, r0, r8)
            ihi.a r0 = r6.f98249a
            r0.j(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.b.c(int, android.view.View):void");
    }

    public final void d(int i, List list) {
        int i2 = this.f98251c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f98251c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f98249a.b(i2).getLayoutParams();
            c cVar = new c();
            cVar.f161422b = flexItem.getOrder();
            cVar.f161421a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        ihi.a aVar = this.f98249a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(d.n("Invalid flex direction: ", flexDirection));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<a> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i3;
            int i5 = 0;
            if (flexLinesInternal.size() == 1) {
                ((a) flexLinesInternal.get(0)).f98240g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    a aVar2 = new a();
                    aVar2.f98240g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar2);
                    return;
                }
                if (alignContent == 2) {
                    aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i5 < size3) {
                        arrayList.add((a) flexLinesInternal.get(i5));
                        if (i5 != flexLinesInternal.size() - 1) {
                            a aVar3 = new a();
                            if (i5 == flexLinesInternal.size() - 2) {
                                aVar3.f98240g = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                aVar3.f98240g = Math.round(size2);
                            }
                            int i6 = aVar3.f98240g;
                            float f4 = (size2 - i6) + f;
                            if (f4 > 1.0f) {
                                aVar3.f98240g = i6 + 1;
                                f4 -= 1.0f;
                            } else if (f4 < -1.0f) {
                                aVar3.f98240g = i6 - 1;
                                f4 += 1.0f;
                            }
                            f = f4;
                            arrayList.add(aVar3);
                        }
                        i5++;
                    }
                    aVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    a aVar4 = new a();
                    aVar4.f98240g = size4;
                    for (a aVar5 : flexLinesInternal) {
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar5);
                        arrayList2.add(aVar4);
                    }
                    aVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f5 = 0.0f;
                    while (i5 < size6) {
                        a aVar6 = (a) flexLinesInternal.get(i5);
                        float f6 = aVar6.f98240g + size5;
                        if (i5 == flexLinesInternal.size() - 1) {
                            f6 += f5;
                            f5 = 0.0f;
                        }
                        int iRound = Math.round(f6);
                        float f32 = (f6 - iRound) + f5;
                        if (f32 > 1.0f) {
                            iRound++;
                            f32 -= 1.0f;
                        } else if (f32 < -1.0f) {
                            iRound--;
                            f32 += 1.0f;
                        }
                        f5 = f32;
                        aVar6.f98240g = iRound;
                        i5++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        ihi.a aVar = this.f98249a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f98250b;
        if (zArr == null) {
            this.f98250b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f98250b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = mode == Integer.MIN_VALUE ? Math.min(largestMainSize, size) : largestMainSize;
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(d.n("Invalid flex direction: ", flexDirection));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
        }
        int i21 = paddingRight + paddingLeft;
        int i22 = size;
        int[] iArr = this.f98251c;
        int i32 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = aVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i32 < size2) {
            a aVar2 = (a) flexLinesInternal.get(i32);
            int i33 = aVar2.e;
            if (i33 >= i22 || !aVar2.f98247q) {
                i5 = i;
                i6 = i2;
                if (i33 > i22 && aVar2.f98248r) {
                    q(i5, i6, aVar2, i22, i21, false);
                }
            } else {
                i5 = i;
                i6 = i2;
                l(i5, i6, aVar2, i22, i21, false);
            }
            i32++;
            i = i5;
            i2 = i6;
        }
    }

    public final void i(int i) {
        int[] iArr = this.f98251c;
        if (iArr == null) {
            this.f98251c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f98251c = Arrays.copyOf(this.f98251c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, a aVar, int i3, int i5, boolean z) {
        int i6;
        float f;
        int i21;
        float f4;
        boolean z3;
        int i22;
        int iMax;
        double d;
        float f5;
        boolean z4;
        boolean z6;
        double d5;
        float f6 = aVar.f98242j;
        float f32 = BitmapDescriptorFactory.HUE_RED;
        if (f6 <= BitmapDescriptorFactory.HUE_RED || i3 < (i6 = aVar.e)) {
            return;
        }
        float f35 = (i3 - i6) / f6;
        aVar.e = i5 + aVar.f;
        if (!z) {
            aVar.f98240g = Integer.MIN_VALUE;
        }
        int i32 = 0;
        boolean z11 = false;
        int i33 = 0;
        float f36 = 0.0f;
        while (i32 < aVar.f98241h) {
            int i43 = aVar.o + i32;
            ihi.a aVar2 = this.f98249a;
            View viewE = aVar2.e(i43);
            if (viewE == null || viewE.getVisibility() == 8) {
                f = f32;
                i21 = i6;
                f4 = f35;
                z3 = z11;
                i22 = i32;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = aVar2.getFlexDirection();
                f = f32;
                if (flexDirection == 0 || flexDirection == 1) {
                    i21 = i6;
                    float f37 = f35;
                    z3 = z11;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i43];
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i43] >> 32);
                    }
                    if (this.f98250b[i43] || flexItem.Q6() <= f) {
                        i22 = i32;
                        f4 = f37;
                    } else {
                        float fQ6 = (flexItem.Q6() * f37) + measuredWidth;
                        if (i32 == aVar.f98241h - 1) {
                            fQ6 += f36;
                            f36 = f;
                        }
                        int iRound = Math.round(fQ6);
                        if (iRound > flexItem.Q7()) {
                            iRound = flexItem.Q7();
                            this.f98250b[i43] = true;
                            aVar.f98242j -= flexItem.Q6();
                            z3 = true;
                            i22 = i32;
                            f4 = f37;
                        } else {
                            float f41 = (fQ6 - iRound) + f36;
                            i22 = i32;
                            f4 = f37;
                            double d6 = f41;
                            if (d6 > 1.0d) {
                                iRound++;
                                d = d6 - 1.0d;
                            } else if (d6 < -1.0d) {
                                iRound--;
                                d = d6 + 1.0d;
                            } else {
                                f36 = f41;
                            }
                            f36 = (float) d;
                        }
                        int iM = m(i2, flexItem, aVar.f98244m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        v(i43, iMakeMeasureSpec, iM, viewE);
                        aVar2.j(i43, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i33, aVar2.d(viewE) + measuredHeight + flexItem.c2() + flexItem.Z3());
                    aVar.e = measuredWidth + flexItem.P8() + flexItem.w9() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        long j2 = jArr3[i43];
                        f5 = f35;
                        z4 = z11;
                        measuredHeight3 = (int) (j2 >> 32);
                    } else {
                        f5 = f35;
                        z4 = z11;
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i43];
                    }
                    if (this.f98250b[i43] || flexItem.Q6() <= f) {
                        i21 = i6;
                        z6 = z4;
                    } else {
                        float fQ62 = (flexItem.Q6() * f5) + measuredHeight3;
                        if (i32 == aVar.f98241h - 1) {
                            fQ62 += f36;
                            f36 = f;
                        }
                        int iRound2 = Math.round(fQ62);
                        if (iRound2 > flexItem.L9()) {
                            iRound2 = flexItem.L9();
                            this.f98250b[i43] = true;
                            aVar.f98242j -= flexItem.Q6();
                            z6 = true;
                            i21 = i6;
                        } else {
                            float f42 = (fQ62 - iRound2) + f36;
                            i21 = i6;
                            double d10 = f42;
                            if (d10 > 1.0d) {
                                iRound2++;
                                d5 = d10 - 1.0d;
                            } else if (d10 < -1.0d) {
                                iRound2--;
                                d5 = d10 + 1.0d;
                            } else {
                                f36 = f42;
                                z6 = z4;
                            }
                            f36 = (float) d5;
                            z6 = z4;
                        }
                        int iN = n(i, flexItem, aVar.f98244m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        v(i43, iN, iMakeMeasureSpec2, viewE);
                        aVar2.j(i43, viewE);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i33, aVar2.d(viewE) + measuredWidth3 + flexItem.P8() + flexItem.w9());
                    aVar.e = measuredHeight3 + flexItem.c2() + flexItem.Z3() + aVar.e;
                    f4 = f5;
                    z3 = z6;
                    i22 = i32;
                }
                aVar.f98240g = Math.max(aVar.f98240g, iMax);
                i33 = iMax;
            }
            i32 = i22 + 1;
            f35 = f4;
            f32 = f;
            i6 = i21;
            z11 = z3;
        }
        int i59 = i6;
        if (!z11 || i59 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i5, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        ihi.a aVar = this.f98249a;
        int iC = aVar.c(i, aVar.getPaddingBottom() + aVar.getPaddingTop() + flexItem.c2() + flexItem.Z3() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iC);
        return size > flexItem.L9() ? View.MeasureSpec.makeMeasureSpec(flexItem.L9(), View.MeasureSpec.getMode(iC)) : size < flexItem.A9() ? View.MeasureSpec.makeMeasureSpec(flexItem.A9(), View.MeasureSpec.getMode(iC)) : iC;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        ihi.a aVar = this.f98249a;
        int iH = aVar.h(i, aVar.getPaddingRight() + aVar.getPaddingLeft() + flexItem.P8() + flexItem.w9() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iH);
        return size > flexItem.Q7() ? View.MeasureSpec.makeMeasureSpec(flexItem.Q7(), View.MeasureSpec.getMode(iH)) : size < flexItem.I1() ? View.MeasureSpec.makeMeasureSpec(flexItem.I1(), View.MeasureSpec.getMode(iH)) : iH;
    }

    public final void o(View view, a aVar, int i, int i2, int i3, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ihi.a aVar2 = this.f98249a;
        int alignItems = aVar2.getAlignItems();
        if (flexItem.S5() != -1) {
            alignItems = flexItem.S5();
        }
        int i6 = aVar.f98240g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (aVar2.getFlexWrap() != 2) {
                    int i21 = i2 + i6;
                    view.layout(i, (i21 - view.getMeasuredHeight()) - flexItem.Z3(), i3, i21 - flexItem.Z3());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i6) + flexItem.c2(), i3, view.getMeasuredHeight() + (i5 - i6) + flexItem.c2());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i6 - view.getMeasuredHeight()) + flexItem.c2()) - flexItem.Z3()) / 2;
                if (aVar2.getFlexWrap() != 2) {
                    int i22 = i2 + measuredHeight;
                    view.layout(i, i22, i3, view.getMeasuredHeight() + i22);
                    return;
                } else {
                    int i32 = i2 - measuredHeight;
                    view.layout(i, i32, i3, view.getMeasuredHeight() + i32);
                    return;
                }
            }
            if (alignItems == 3) {
                if (aVar2.getFlexWrap() != 2) {
                    int iMax = Math.max(aVar.f98243l - view.getBaseline(), flexItem.c2());
                    view.layout(i, i2 + iMax, i3, i5 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (aVar.f98243l - view.getMeasuredHeight()), flexItem.Z3());
                    view.layout(i, i2 - iMax2, i3, i5 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (aVar2.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.c2(), i3, i5 + flexItem.c2());
        } else {
            view.layout(i, i2 - flexItem.Z3(), i3, i5 - flexItem.Z3());
        }
    }

    public final void p(View view, a aVar, boolean z, int i, int i2, int i3, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f98249a.getAlignItems();
        if (flexItem.S5() != -1) {
            alignItems = flexItem.S5();
        }
        int i6 = aVar.f98240g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i6) - view.getMeasuredWidth()) - flexItem.w9(), i2, ((i3 + i6) - view.getMeasuredWidth()) - flexItem.w9(), i5);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i6) + flexItem.P8(), i2, view.getMeasuredWidth() + (i3 - i6) + flexItem.P8(), i5);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i6 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i5);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i5);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.w9(), i2, i3 - flexItem.w9(), i5);
        } else {
            view.layout(i + flexItem.P8(), i2, i3 + flexItem.P8(), i5);
        }
    }

    public final void q(int i, int i2, a aVar, int i3, int i5, boolean z) {
        float f;
        float f4;
        int iMax;
        int iI1;
        int iA9;
        int i6 = aVar.e;
        float f5 = aVar.k;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (f5 <= BitmapDescriptorFactory.HUE_RED || i3 > i6) {
            return;
        }
        float f32 = (i6 - i3) / f5;
        aVar.e = i5 + aVar.f;
        if (!z) {
            aVar.f98240g = Integer.MIN_VALUE;
        }
        int i21 = 0;
        boolean z3 = false;
        int i22 = 0;
        float f35 = 0.0f;
        while (i21 < aVar.f98241h) {
            int i32 = aVar.o + i21;
            ihi.a aVar2 = this.f98249a;
            View viewE = aVar2.e(i32);
            if (viewE == null || viewE.getVisibility() == 8) {
                f = f6;
                f4 = f32;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = aVar2.getFlexDirection();
                f = f6;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f32;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i32];
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i32] >> 32);
                    }
                    if (!this.f98250b[i32] && flexItem.W5() > f) {
                        float fW5 = measuredWidth - (f4 * flexItem.W5());
                        if (i21 == aVar.f98241h - 1) {
                            fW5 += f35;
                            f35 = f;
                        }
                        int iRound = Math.round(fW5);
                        if (iRound < flexItem.I1()) {
                            iI1 = flexItem.I1();
                            this.f98250b[i32] = true;
                            aVar.k -= flexItem.W5();
                            z3 = true;
                        } else {
                            float f36 = (fW5 - iRound) + f35;
                            double d = f36;
                            if (d > 1.0d) {
                                iI1 = iRound + 1;
                                f36 -= 1.0f;
                            } else if (d < -1.0d) {
                                iI1 = iRound - 1;
                                f36 += 1.0f;
                            } else {
                                iI1 = iRound;
                            }
                            f35 = f36;
                        }
                        int iM = m(i2, flexItem, aVar.f98244m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iI1, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        v(i32, iMakeMeasureSpec, iM, viewE);
                        aVar2.j(i32, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i22, aVar2.d(viewE) + measuredHeight + flexItem.c2() + flexItem.Z3());
                    aVar.e = measuredWidth + flexItem.P8() + flexItem.w9() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i32] >> 32);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i32];
                    }
                    if (this.f98250b[i32] || flexItem.W5() <= f) {
                        f4 = f32;
                    } else {
                        float fW52 = measuredHeight3 - (flexItem.W5() * f32);
                        if (i21 == aVar.f98241h - 1) {
                            fW52 += f35;
                            f35 = f;
                        }
                        int iRound2 = Math.round(fW52);
                        if (iRound2 < flexItem.A9()) {
                            iA9 = flexItem.A9();
                            this.f98250b[i32] = true;
                            aVar.k -= flexItem.W5();
                            z3 = true;
                            f4 = f32;
                        } else {
                            float f37 = (fW52 - iRound2) + f35;
                            f4 = f32;
                            double d5 = f37;
                            if (d5 > 1.0d) {
                                iA9 = iRound2 + 1;
                                f37 -= 1.0f;
                            } else if (d5 < -1.0d) {
                                iA9 = iRound2 - 1;
                                f37 += 1.0f;
                            } else {
                                iA9 = iRound2;
                            }
                            f35 = f37;
                        }
                        int iN = n(i, flexItem, aVar.f98244m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iA9, 1073741824);
                        viewE.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        v(i32, iN, iMakeMeasureSpec2, viewE);
                        aVar2.j(i32, viewE);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i22, aVar2.d(viewE) + measuredWidth3 + flexItem.P8() + flexItem.w9());
                    aVar.e = measuredHeight3 + flexItem.c2() + flexItem.Z3() + aVar.e;
                }
                aVar.f98240g = Math.max(aVar.f98240g, iMax);
                i22 = iMax;
            }
            i21++;
            f6 = f;
            f32 = f4;
        }
        if (!z3 || i6 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i5, true);
    }

    public final void s(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iP8 = (i - flexItem.P8()) - flexItem.w9();
        ihi.a aVar = this.f98249a;
        int iMin = Math.min(Math.max(iP8 - aVar.d(view), flexItem.I1()), flexItem.Q7());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        aVar.j(i2, view);
    }

    public final void t(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iC2 = (i - flexItem.c2()) - flexItem.Z3();
        ihi.a aVar = this.f98249a;
        int iMin = Math.min(Math.max(iC2 - aVar.d(view), flexItem.A9()), flexItem.L9());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        aVar.j(i2, view);
    }

    public final void u(int i) {
        View viewE;
        ihi.a aVar = this.f98249a;
        if (i >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() != 4) {
            for (a aVar2 : aVar.getFlexLinesInternal()) {
                for (Integer num : aVar2.f98245n) {
                    View viewE2 = aVar.e(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewE2, aVar2.f98240g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(d.n("Invalid flex direction: ", flexDirection));
                        }
                        s(viewE2, aVar2.f98240g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f98251c;
        List flexLinesInternal = aVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            a aVar3 = (a) flexLinesInternal.get(i2);
            int i3 = aVar3.f98241h;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = aVar3.o + i5;
                if (i5 < aVar.getFlexItemCount() && (viewE = aVar.e(i6)) != null && viewE.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    if (flexItem.S5() == -1 || flexItem.S5() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewE, aVar3.f98240g, i6);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(d.n("Invalid flex direction: ", flexDirection));
                            }
                            s(viewE, aVar3.f98240g, i6);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & BodyPartID.bodyIdMax) | (((long) i3) << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            int measuredWidth = view.getMeasuredWidth();
            jArr2[i] = (((long) measuredWidth) & BodyPartID.bodyIdMax) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}

package et0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends ViewGroup {

    @NotNull
    public static final a Companion = new a();
    public static final int[][] k = {new int[]{15}, new int[]{9, 6}, new int[]{9, 2, 4}, new int[]{1, 8, 2, 4}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f129062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f129063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f129064c;
    public final ArrayList d;
    public final boolean[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f129065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function1 f129066h;
    public Function1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f129067j;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i, Float f) {
        if (i >= 0) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            if (this.f129065g && i == 3) {
                return;
            }
            Object obj2 = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            i iVar = (i) obj2;
            if (iVar.getVisibility() == 0) {
                iVar.setLoading(f, this.e[i], new k(this, i, 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            int r9 = r9 - r7
            int r6 = r5.f129064c
            int r9 = r9 - r6
            r7 = 2
            int r9 = r9 / r7
            r8 = 0
            if (r9 >= 0) goto La
            r9 = r8
        La:
            int r9 = r9 + r6
            int r6 = r5.f
            r10 = r8
        Le:
            if (r10 >= r6) goto L4e
            java.util.ArrayList r0 = r5.d
            java.lang.Object r0 = zhm.d0.e0(r10, r0)
            et0.i r0 = (et0.i) r0
            if (r0 != 0) goto L1b
            goto L4e
        L1b:
            int r1 = r5.f
            r2 = 3
            r3 = 1
            if (r1 == r3) goto L27
            if (r1 == r7) goto L2b
            if (r1 == r2) goto L2b
            if (r10 > r3) goto L29
        L27:
            r4 = r8
            goto L2e
        L29:
            r4 = r3
            goto L2e
        L2b:
            if (r10 != 0) goto L29
            goto L27
        L2e:
            int r4 = r4 * r9
            if (r1 == r3) goto L39
            if (r1 == r7) goto L39
            if (r1 == r2) goto L3b
            if (r10 == r3) goto L3d
            if (r10 == r2) goto L3d
        L39:
            r3 = r8
            goto L3d
        L3b:
            if (r10 != r7) goto L39
        L3d:
            int r3 = r3 * r9
            int r1 = r0.getMeasuredWidth()
            int r1 = r1 + r4
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r3
            r0.layout(r4, r3, r1, r2)
            int r10 = r10 + 1
            goto Le
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: et0.l.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        i iVar;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (size < 0) {
            size = 0;
        }
        int i5 = (size - this.f129064c) / 2;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = this.f;
        while (i3 < i6 && (iVar = (i) zhm.d0.e0(i3, this.d)) != null) {
            int i21 = this.f;
            iVar.measure(View.MeasureSpec.makeMeasureSpec(i21 == 1 ? size : i5, 1073741824), View.MeasureSpec.makeMeasureSpec((i21 == 1 || i21 == 2 || (i21 == 3 && i3 == 0)) ? size : i5, 1073741824));
            i3++;
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.min(size, size2);
        } else if (mode != 1073741824) {
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setImages(@NotNull List<kp0.i> images) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(images, "images");
        int size = images.size();
        if (size > 4) {
            size = 4;
        }
        int i = 0;
        this.f129065g = images.size() > 4;
        int iMax = Math.max(images.size() - 4, 0);
        boolean z = this.f != size;
        this.f = size;
        while (true) {
            arrayList = this.d;
            AttributeSet attributeSet = null;
            if (arrayList.size() >= size) {
                break;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i iVar = new i(context, attributeSet, 6, i);
            iVar.setId(View.generateViewId());
            arrayList.add(iVar);
            addView(iVar);
        }
        if (z) {
            requestLayout();
        }
        final int i2 = 0;
        for (int i3 = 4; i2 < i3; i3 = 4) {
            i iVar2 = (i) zhm.d0.e0(i2, arrayList);
            if (iVar2 == null) {
                return;
            }
            if (i2 >= size) {
                iVar2.setVisibility(8);
                iVar2.setOnClickListener(null);
            } else {
                iVar2.setVisibility(0);
                if (z && size != 0) {
                    int i5 = k[size - 1][i2];
                    int i6 = i5 & 1;
                    float f = this.f129063b;
                    float f4 = this.f129062a;
                    float f5 = i6 != 0 ? f4 : f;
                    float f6 = (i5 & 2) != 0 ? f4 : f;
                    float f32 = (i5 & 4) != 0 ? f4 : f;
                    if ((i5 & 8) != 0) {
                        f = f4;
                    }
                    iVar2.setCornerRadius(f5, f6, f32, f);
                }
                kp0.i iVar3 = images.get(i2);
                iVar3.getClass();
                this.e[i2] = false;
                iVar2.setImage(iVar3.f188016a, z);
                final boolean z3 = i2 == 3 && this.f129065g;
                iVar2.setOnClickListener(new View.OnClickListener() { // from class: et0.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z4 = z3;
                        l lVar = this;
                        if (z4) {
                            lVar.f129067j.invoke();
                        } else {
                            lVar.f129066h.invoke(Integer.valueOf(i2));
                        }
                    }
                });
                iVar2.setOverlay(z3);
                Integer numValueOf = Integer.valueOf(iMax);
                if (!z3) {
                    numValueOf = null;
                }
                iVar2.setCounter(numValueOf != null ? numValueOf.intValue() : 0);
            }
            i2++;
        }
    }

    public final void setOnCancelImageClickListener(@NotNull Function1<? super Integer, Unit> onCancelImageClick) {
        Intrinsics.checkNotNullParameter(onCancelImageClick, "onCancelImageClick");
        this.i = onCancelImageClick;
    }

    public final void setOnGalleryClickListener(@NotNull Function0<Unit> onGalleryClick) {
        Intrinsics.checkNotNullParameter(onGalleryClick, "onGalleryClick");
        this.f129067j = onGalleryClick;
    }

    public final void setOnImageClickListener(@NotNull Function1<? super Integer, Unit> onImageClick) {
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        this.f129066h = onImageClick;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129062a = kli.a.k(context, 16.0f);
        this.f129063b = kli.a.k(context, 2.0f);
        this.f129064c = kli.a.k(context, 2.0f);
        this.d = new ArrayList(4);
        this.e = new boolean[4];
        this.f129066h = new eqd.h(21);
        this.i = new eqd.h(22);
        this.f129067j = new ekd.i0(23);
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

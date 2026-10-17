package ht0;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f155173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f155174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155175c;
    public final float d;

    public q(e baseStrategy, View view, boolean z, float f) {
        Intrinsics.checkNotNullParameter(baseStrategy, "baseStrategy");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f155173a = baseStrategy;
        this.f155174b = view;
        this.f155175c = z;
        this.d = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ht0.v
    public final List a(List points) {
        Intrinsics.checkNotNullParameter(points, "points");
        View view = this.f155174b;
        int width = view.getWidth();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, this.d);
        int i = 0;
        if (this.f155175c) {
            Intrinsics.checkNotNullParameter(points, "<this>");
            if (!points.isEmpty() && iK > 0) {
                float f = (((PointF) zhm.d0.m0(points)).x / iK) + 1;
                if (f < points.size()) {
                    if (f <= 1.0f || Float.isNaN(f)) {
                        points = zhm.v.k(zhm.d0.b0(points), zhm.d0.m0(points));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List list = points;
                        List listV0 = zhm.d0.V0(list, points.size() - 1);
                        Iterator it8 = listV0.iterator();
                        if (!it8.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it8.next();
                        if (it8.hasNext()) {
                            float f4 = ((PointF) next).y;
                            do {
                                Object next2 = it8.next();
                                float f5 = ((PointF) next2).y;
                                if (Float.compare(f4, f5) < 0) {
                                    next = next2;
                                    f4 = f5;
                                }
                            } while (it8.hasNext());
                        }
                        PointF pointF = (PointF) next;
                        Iterator it9 = listV0.iterator();
                        if (!it9.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next3 = it9.next();
                        if (it9.hasNext()) {
                            float f6 = ((PointF) next3).y;
                            do {
                                Object next4 = it9.next();
                                float f32 = ((PointF) next4).y;
                                if (Float.compare(f6, f32) > 0) {
                                    next3 = next4;
                                    f6 = f32;
                                }
                            } while (it9.hasNext());
                        }
                        PointF pointF2 = (PointF) next3;
                        int iC = rim.d.c(points.size() / f);
                        for (Object obj2 : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            PointF pointF3 = (PointF) obj2;
                            if (i % iC == 0 || i == points.size() - 1 || Intrinsics.f(pointF3, pointF) || Intrinsics.f(pointF3, pointF2)) {
                                arrayList.add(pointF3);
                            }
                            i = i2;
                        }
                        points = arrayList;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(points, "<this>");
            float fFloor = (float) Math.floor((width - iK) / iK);
            if (fFloor < points.size()) {
                float size = 1.0f / (fFloor / points.size());
                ArrayList arrayList2 = new ArrayList();
                float f35 = 1.0f;
                while (i < points.size()) {
                    Object obj3 = points.get(i);
                    if (f35 >= size) {
                        arrayList2.add(obj3);
                        f35 -= size;
                    }
                    f35 += 1.0f;
                    i++;
                }
                points = arrayList2;
            }
        }
        return this.f155173a.a(points);
    }
}

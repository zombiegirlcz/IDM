package xw0;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import ix0.h1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f309313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f309314c;
    public d d;
    public final ihm.f e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f309315g;

    public f(List detectors) {
        Intrinsics.checkNotNullParameter(detectors, "detectors");
        this.f309312a = detectors;
        d dVar = (d) d0.o0(detectors);
        if (dVar != null) {
            dVar.i = false;
        }
        this.e = v0.a.d("create(...)");
        this.f = new e(this, 0);
        this.f309315g = new e(this, 1);
    }

    public final void a() {
        if (this.f309313b) {
            return;
        }
        this.f309313b = true;
        if (this.f309314c) {
            List list = this.f309312a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) list.get(i);
                boolean z = dVar.f;
                if (!z) {
                    if (!dVar.e && !z) {
                        dVar.e = true;
                        if (!dVar.f309307g) {
                            dVar.f309307g = true;
                            try {
                                SensorManager sensorManagerA = dVar.a();
                                int[] iArr = dVar.f309306c;
                                if (iArr != null) {
                                    int length = iArr.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            break;
                                        }
                                        if (sensorManagerA.getDefaultSensor(iArr[i2]) == null) {
                                            dVar.f = true;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } catch (Exception e) {
                                dVar.f = true;
                                if (e instanceof UnsupportedOperationException) {
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                } else {
                                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(e);
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, unsupportedOperationException, h0Var2);
                                }
                            }
                        }
                        if (!dVar.f) {
                            try {
                                SensorManager sensorManagerA2 = dVar.a();
                                Sensor defaultSensor = sensorManagerA2.getDefaultSensor(dVar.f309305b);
                                if (defaultSensor == null) {
                                    dVar.f = true;
                                } else {
                                    sensorManagerA2.registerListener(dVar, defaultSensor, 2);
                                    dVar.d();
                                    if (dVar.i) {
                                        dVar.f309308h = true;
                                        h1.d(2000L, dVar);
                                    }
                                }
                            } catch (Exception e2) {
                                if (e2 instanceof UnsupportedOperationException) {
                                    h0 h0Var3 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var3);
                                } else {
                                    UnsupportedOperationException unsupportedOperationException2 = new UnsupportedOperationException(e2);
                                    h0 h0Var4 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, unsupportedOperationException2, h0Var4);
                                }
                                dVar.f = true;
                                try {
                                    SensorManager sensorManager = dVar.d;
                                    if (sensorManager != null) {
                                        sensorManager.unregisterListener(dVar);
                                        Unit unit = Unit.f186387a;
                                    }
                                } catch (Exception e4) {
                                    h0 h0Var5 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var5);
                                }
                            }
                        }
                    }
                    if (!dVar.f) {
                        dVar.k = this.f;
                        dVar.f309309j = this.f309315g;
                        this.d = dVar;
                        return;
                    }
                }
            }
        }
    }
}

package com.google.firebase.perf.session;

import ah.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nf.p;
import xf.l0;
import xf.m0;
import xf.o0;

/* JADX INFO: loaded from: classes.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new q(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f49590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49591c;

    public PerfSession(String str, a aVar) {
        this.f49591c = false;
        this.f49589a = str;
        this.f49590b = new Timer();
    }

    public static m0[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        m0[] m0VarArr = new m0[list.size()];
        m0 m0VarA = ((PerfSession) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            m0 m0VarA2 = ((PerfSession) list.get(i)).a();
            if (z || !((PerfSession) list.get(i)).f49591c) {
                m0VarArr[i] = m0VarA2;
            } else {
                m0VarArr[0] = m0VarA2;
                m0VarArr[i] = m0VarA;
                z = true;
            }
        }
        if (!z) {
            m0VarArr[0] = m0VarA;
        }
        return m0VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.perf.session.PerfSession c(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.c(java.lang.String):com.google.firebase.perf.session.PerfSession");
    }

    public final m0 a() {
        l0 l0VarNewBuilder = m0.newBuilder();
        l0VarNewBuilder.c();
        ((m0) l0VarNewBuilder.f49761b).setSessionId(this.f49589a);
        if (this.f49591c) {
            o0 o0Var = o0.GAUGES_AND_SYSTEM_EVENTS;
            l0VarNewBuilder.c();
            ((m0) l0VarNewBuilder.f49761b).addSessionVerbosity(o0Var);
        }
        return (m0) l0VarNewBuilder.a();
    }

    public final boolean d() {
        p pVar;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f49590b.a());
        nf.a aVarE = nf.a.e();
        aVarE.getClass();
        synchronized (p.class) {
            try {
                if (p.f214782a == null) {
                    p.f214782a = new p();
                }
                pVar = p.f214782a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        f fVarJ = aVarE.j(pVar);
        if (!fVarJ.b() || ((Long) fVarJ.a()).longValue() <= 0) {
            f fVar = aVarE.f214765a.getLong("fpr_session_max_duration_min");
            if (!fVar.b() || ((Long) fVar.a()).longValue() <= 0) {
                f fVarC = aVarE.c(pVar);
                jLongValue = (!fVarC.b() || ((Long) fVarC.a()).longValue() <= 0) ? 240L : ((Long) fVarC.a()).longValue();
            } else {
                aVarE.f214767c.e(((Long) fVar.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) fVar.a()).longValue();
            }
        } else {
            jLongValue = ((Long) fVarJ.a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49589a);
        parcel.writeByte(this.f49591c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f49590b, 0);
    }

    public PerfSession(Parcel parcel) {
        this.f49591c = false;
        this.f49589a = parcel.readString();
        this.f49591c = parcel.readByte() != 0;
        this.f49590b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}

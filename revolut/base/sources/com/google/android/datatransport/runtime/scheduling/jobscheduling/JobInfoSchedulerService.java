package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import fc.d;
import fc.g;
import java.util.concurrent.Executor;
import jpf.a;
import zb.j;
import zb.s;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37252a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        a aVarA = j.a();
        aVarA.x(string);
        aVarA.f177269c = jc.a.b(i);
        if (string2 != null) {
            aVarA.f177268b = Base64.decode(string2, 0);
        }
        g gVar = s.a().d;
        ((Executor) gVar.e).execute(new d(gVar, aVarA.j(), i2, new ce.j(this, jobParameters, 4)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

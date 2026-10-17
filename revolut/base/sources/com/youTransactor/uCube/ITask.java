package com.youTransactor.uCube;

/* JADX INFO: loaded from: classes15.dex */
public interface ITask {
    void cancel(ITaskCancelListener iTaskCancelListener);

    void execute(ITaskMonitor iTaskMonitor);
}

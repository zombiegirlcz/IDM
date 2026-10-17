package com.youTransactor.uCube;

import androidx.annotation.NonNull;
import com.youTransactor.uCube.log.LogManager;
import kp0.b;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractTask implements ITask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107542a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107543b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITaskMonitor f107544c;

    public final /* synthetic */ void a(ITaskCancelListener iTaskCancelListener, boolean z) {
        if (!z) {
            this.f107542a = false;
        }
        iTaskCancelListener.onCancelFinish(z);
    }

    @Override // com.youTransactor.uCube.ITask
    public final void cancel(ITaskCancelListener iTaskCancelListener) {
        if (!this.f107543b) {
            if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.SYSTEM.getCode()) {
                LogManager.w("[SYSTEM]", "task is not running it can't be cancelled");
            }
            iTaskCancelListener.onCancelFinish(false);
        } else if (!this.f107542a) {
            this.f107542a = true;
            a(new b(this, iTaskCancelListener, 6));
        } else {
            if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.SYSTEM.getCode()) {
                LogManager.w("[SYSTEM]", "A cancel process already started");
            }
            iTaskCancelListener.onCancelFinish(false);
        }
    }

    @Override // com.youTransactor.uCube.ITask
    public final void execute(@NonNull ITaskMonitor iTaskMonitor) {
        if (this.f107543b || this.f107542a) {
            if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.SYSTEM.getCode()) {
                LogManager.w("[SYSTEM]", "task is running or cancel is progress please wait");
            }
        } else {
            this.f107544c = iTaskMonitor;
            this.f107543b = true;
            start();
        }
    }

    public ITaskMonitor getMonitor() {
        return this.f107544c;
    }

    public final boolean isRunning() {
        return this.f107543b;
    }

    public boolean isTryCancel() {
        return this.f107542a;
    }

    public void notifyMonitor(TaskEvent taskEvent, Object... objArr) {
        ITaskMonitor iTaskMonitor = this.f107544c;
        if (iTaskMonitor != null) {
            iTaskMonitor.handleEvent(taskEvent, objArr);
        }
        if (taskEvent != TaskEvent.PROGRESS) {
            this.f107543b = false;
            this.f107544c = null;
            this.f107542a = false;
        }
    }

    public abstract void start();

    public void a(ITaskCancelListener iTaskCancelListener) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.SYSTEM.getCode()) {
            LogManager.d("[SYSTEM]", "Abstract task stop()");
        }
        notifyMonitor(TaskEvent.CANCELLED, new Object[0]);
        iTaskCancelListener.onCancelFinish(true);
    }
}

package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DynamicConverter<E> extends FormattingConverter<E> implements LifeCycle, ContextAware {
    private List<String> optionList;

    /* JADX INFO: renamed from: cab, reason: collision with root package name */
    ContextAwareBase f24075cab = new ContextAwareBase(this);
    protected boolean started = false;

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        this.f24075cab.addError(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        this.f24075cab.addInfo(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        this.f24075cab.addStatus(status);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        this.f24075cab.addWarn(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.f24075cab.getContext();
    }

    public String getFirstOption() {
        List<String> list = this.optionList;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.optionList.get(0);
    }

    public List<String> getOptionList() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.f24075cab.setContext(context);
    }

    public void setOptionList(List<String> list) {
        this.optionList = list;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th10) {
        this.f24075cab.addError(str, th10);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th10) {
        this.f24075cab.addInfo(str, th10);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th10) {
        this.f24075cab.addWarn(str, th10);
    }
}

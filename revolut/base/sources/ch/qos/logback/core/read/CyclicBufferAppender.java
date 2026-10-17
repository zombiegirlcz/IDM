package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    CyclicBuffer<E> f24076cb;
    int maxSize = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            this.f24076cb.add(e);
        }
    }

    public E get(int i) {
        if (isStarted()) {
            return this.f24076cb.get(i);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f24076cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.f24076cb.clear();
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f24076cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f24076cb = null;
        super.stop();
    }
}

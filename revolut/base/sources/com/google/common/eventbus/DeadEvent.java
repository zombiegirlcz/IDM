package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
public class DeadEvent {
    private final Object event;
    private final Object source;

    public DeadEvent(Object obj2, Object obj3) {
        this.source = Preconditions.checkNotNull(obj2);
        this.event = Preconditions.checkNotNull(obj3);
    }

    public Object getEvent() {
        return this.event;
    }

    public Object getSource() {
        return this.source;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.source).add("event", this.event).toString();
    }
}

package org.ejbca.cvc;

import org.ejbca.cvc.exception.ConstructionException;

/* JADX INFO: loaded from: classes14.dex */
public interface Signable {
    byte[] getTBS() throws ConstructionException;
}

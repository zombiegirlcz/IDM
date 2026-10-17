package org.jmrtd;

import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class FileSystemCardService extends CardService {
    @Deprecated
    public abstract CardFileInputStream getInputStream(short s2) throws CardServiceException;

    public abstract CardFileInputStream getInputStream(short s2, int i) throws CardServiceException;
}
